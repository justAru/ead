package strategyExample.strategy;

import strategyExample.NavigatorStrategy;

public class RoadStrategy implements NavigatorStrategy {
    @Override
    public String buildRoute(String A, String B) {
        return String.format("Building route by car from destination  %s to %s ...", A, B);

    }
}
