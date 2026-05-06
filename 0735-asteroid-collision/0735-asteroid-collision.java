class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> tray = new Stack<>();

        for (int i = 0; i < asteroids.length; i ++) {
            int curr = asteroids[i];
            boolean exploded = false;

            while (!tray.isEmpty() && curr < 0 && tray.peek() > 0) {
                if (tray.peek() < Math.abs(curr)) {
                    tray.pop();
                    continue;
                } else if (tray.peek() == Math.abs(curr)) {
                    tray.pop();
                    exploded = true;
                    break;
                } else {
                    exploded = true;
                    break;
                }
            }

            if (!exploded)
                tray.push(curr);
        }


        int[] res = new int[tray.size()];
        for (int i = tray.size() - 1; i >= 0 ; i --) {
            res[i] = tray.pop();
        }

        return res;
    }
}