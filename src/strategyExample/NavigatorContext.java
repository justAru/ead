package strategyExample;

import strategyExample.strategy.RoadStrategy;

public class NavigatorContext {

    private NavigatorStrategy navigatorStrategy;

    public NavigatorContext() {
        this.navigatorStrategy = new RoadStrategy();
    }

    public NavigatorContext(NavigatorStrategy navigatorStrategy) {
        this.navigatorStrategy = navigatorStrategy;
    }

    public String buildRoute(String A, String B){
        return navigatorStrategy.buildRoute(A, B);
    }

    public void setNavigatorStrategy(NavigatorStrategy navigatorStrategy) {
        this.navigatorStrategy = navigatorStrategy;
    }
}
