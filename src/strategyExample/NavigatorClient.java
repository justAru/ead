package strategyExample;

import strategyExample.strategy.WalkingStrategy;

public class NavigatorClient {
    public static void main(String[] args) {

        NavigatorContext context = new NavigatorContext();
        System.out.println(context.buildRoute("IITU", "Airport"));

        context.setNavigatorStrategy(new WalkingStrategy());
        System.out.println(context.buildRoute("IITU", "Airport"));

    }
}
