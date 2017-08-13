package com.howtographql.hackernews;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.coxautodev.graphql.tools.SchemaParser;
import javax.servlet.annotation.WebServlet;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    public GraphQLEndpoint() {
        super(buildSchema());
    }

    private static GraphQLSchema buildSchema() {
        GraphQLRootResolver query = new Query(new LinkRepository());
        List<GraphQLRootResolver> resolvers = new ArrayList<>();
        resolvers.add(query);
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(resolvers)
                .build()
                .makeExecutableSchema();
    }
}