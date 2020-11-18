package com.github.singals.algo;

import lombok.Getter;

public class Maze {
    /**
     * [ a b c ]
     * [ d e f ]
     * [ g h i ]
     * <p>
     * The shortest path from a to e is  either a->b->e or a->d->e
     * <p>
     * Navigation is only in East, South and South East direction only.
     */

    public static int findShortestDistance(int[][] arr, Location a, Location b) {
        if (a.equals(b)) return 0;
        int r = -1, d = -1;
        if (canTraverseRight(arr, a)) {
            r = traverseRight(arr, a, b, 0);
        }

        if (canTraverseDown(arr, a)) {
            d = traverseDown(arr, a, b, 0);
        }

        return Math.max(r, d);
    }

    private static boolean canTraverseRight(int[][] arr, Location loc) {
        return loc.y < (arr[loc.x].length - 1);
    }

    private static boolean canTraverseDown(int[][] arr, Location loc) {
        return loc.x < (arr.length - 1);
    }

    private static int traverseRight(int[][] arr, Location a, Location b, int level) {
        if (a.equals(b)) return level;
        int foundAtLevelRight = 0, foundAtLevelDown = 0;
        if (canTraverseRight(arr, a)) {
            Location nextLocation = new Location(a.getX(), a.getY() + 1);
            foundAtLevelRight = traverseRight(arr, nextLocation, b, level + 1);
        }
        if (canTraverseDown(arr, a)) {
            Location nextLocation = new Location(a.getX() + 1, a.getY());
            foundAtLevelDown = traverseDown(arr, nextLocation, b, level + 1);
        }
        if (foundAtLevelDown > 0 || foundAtLevelRight > 0) return Math.max(foundAtLevelDown, foundAtLevelRight);
        return -1;
    }

    private static int traverseDown(int[][] arr, Location a, Location b, int level) {
        if (a.equals(b)) return level;
        int foundAtLevelRight = 0, foundAtLevelDown = 0;
        if (canTraverseDown(arr, a)) {
            Location nextLocation = new Location(a.getX() + 1, a.getY());
            foundAtLevelDown = traverseDown(arr, nextLocation, b, level + 1);
        }
        if (canTraverseRight(arr, a)) {
            Location nextLocation = new Location(a.getX(), a.getY() + 1);
            foundAtLevelRight = traverseRight(arr, nextLocation, b, level + 1);
        }
        if (foundAtLevelDown > 0 || foundAtLevelRight > 0) return Math.max(foundAtLevelDown, foundAtLevelRight);
        return -1;
    }
}

@Getter
class Location {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (x != location.x) return false;
        return y == location.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
