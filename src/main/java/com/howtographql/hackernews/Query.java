package com.howtographql.hackernews;
import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.util.List;
import java.util.ArrayList;

public class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks(Integer limit) {
        System.out.println("\r\n");
        return linkRepository.getAllLinks(limit);
    }

    public List<Link> allReverseLinks() {
        System.out.println("\r\n");
        return linkRepository.getAllReverseLinks();
    }
}