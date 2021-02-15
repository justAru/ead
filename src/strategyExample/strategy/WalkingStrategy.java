package strategyExample.strategy;

import strategyExample.NavigatorStrategy;

public class WalkingStrategy implements NavigatorStrategy {
    @Override
    public String buildRoute(String A, String B) {
        return String.format("Building walking route from destination  %s to %s ...", A, B);
    }
}
