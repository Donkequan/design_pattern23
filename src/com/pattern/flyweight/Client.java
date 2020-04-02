package com.pattern.flyweight;

public class Client {

    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();

        AbstractWebsite website = websiteFactory.getWebsite("news");

        website.use(new User("hou"));

        AbstractWebsite website1 = websiteFactory.getWebsite("WeChat");
        website1.use(new User("dong"));
        AbstractWebsite website2 = websiteFactory.getWebsite("WeChat");
        website1.use(new User("kun"));
        System.out.println(websiteFactory.getCount());

    }
}
