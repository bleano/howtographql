package com.howtographql.hackernews;
import java.text.ParseException;
import java.util.List;
import java.util.ArrayList;

public class LinkRepository {

    private final List<Link> links;
    private final List<Link> reverseLinks;


    public LinkRepository() {
        links = new ArrayList<>();
        links.add(new Link("http://howtographql.com", "Your favorite GraphQL page"));
        links.add(new Link("http://graphql.org/learn/", "The official docks"));

        reverseLinks = new ArrayList<>();
        reverseLinks.add(new Link(new StringBuilder("http://howtographql.com").reverse().toString(),
                new StringBuilder("Your favorite GraphQL page").reverse().toString()));
        reverseLinks.add(new Link(new StringBuilder("http://graphql.org/learn/").reverse().toString(),
                new StringBuilder("The official docks").reverse().toString()));
    }

    public List<Link> getAllLinks(Integer limit){
//        System.out.println(String.format("getAllLinksEntry:%s", Utils.getTimeStamp(System.currentTimeMillis())));
//        try{
//            Thread.sleep(1000);
//        }catch(Exception e){
//
//        }
//        System.out.println(String.format("getAllLinks:%s", Utils.getTimeStamp(System.currentTimeMillis())));
        return links.subList(0, limit);
    }

    public List<Link> getAllReverseLinks(){
//        System.out.println(String.format("getAllReverseLinksEntry:%s", Utils.getTimeStamp(System.currentTimeMillis())));
//        try{
//            Thread.sleep(5000);
//        }catch(Exception e){
//
//        }
//        System.out.println(String.format("getAllReverseLinks:%s", Utils.getTimeStamp(System.currentTimeMillis())));
        return reverseLinks;
    }

    public void saveLink(Link link) {
        links.add(link);
    }
}
