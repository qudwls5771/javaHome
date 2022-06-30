import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public final class Dungeon {

    private final Map<Integer, Map<Integer, Room>> map = new HashMap<Integer, Map<Integer, Room>>();
    private Room currentRoom;
    private int currentX = 0;
    private int currentY = 0;

    private Dungeon() {
    }

    private void putRoom(int x, int y, Room room) {
        if (!map.containsKey(x)) {
            map.put(x, new HashMap<Integer, Room>());
        }
        map.get(x).put(y, room);
    }

    private Room getRoom(int x, int y) {
        return map.get(x).get(y);
    }

    private boolean roomExists(int x, int y) {
        if (!map.containsKey(x)) {
            return false;
        }
        return map.get(x).containsKey(y);
    }

    private boolean isComplete() {
        return currentRoom.isBossRoom() && currentRoom.isComplete();
    }

    public void movePlayer(Player player) throws IOException {
        boolean northPossible = roomExists(currentX, currentY + 1);
        boolean southPossible = roomExists(currentX, currentY - 1);
        boolean eastPossible = roomExists(currentX + 1, currentY);
        boolean westPossible = roomExists(currentX - 1, currentY);
        System.out.print("어디로 이동하시겠습니까? :");
        if (northPossible) {
            System.out.print(" North (n)");
        }
        if (eastPossible) {
            System.out.print(" East (e)");
        }
        if (southPossible) {
            System.out.print(" South (s)");
        }
        if (westPossible) {
            System.out.print(" West (w)");
        }
        System.out.print(" ? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String direction = in.readLine();
        if (direction.equals("n") && northPossible) {
            currentY++;
        } else if (direction.equals("s") && southPossible) {
            currentY--;
        } else if (direction.equals("e") && eastPossible) {
            currentX++;
        } else if (direction.equals("w") && westPossible) {
            currentX--;
        }
        currentRoom = getRoom(currentX, currentY);
        currentRoom.enter(player);
    }

    public void startQuest(Player player) throws IOException {
        while (player.isAlive() && !isComplete()) {
            movePlayer(player);
        }
        if (player.isAlive()) {
            System.out.println(Art.CROWN);
        } else {
            System.out.println(Art.REAPER);
        }
    }

    public static Dungeon newInstance() {
        Dungeon dungeon = new Dungeon();
        dungeon.putRoom(0, 0, Room.newRegularInstance());
        dungeon.putRoom(-1, 1, Room.newRegularInstance());
        dungeon.putRoom(0, 1, Room.newRegularInstance());
        dungeon.putRoom(1, 1, Room.newRegularInstance());
        dungeon.putRoom(-1, 2, Room.newRegularInstance());
        dungeon.putRoom(1, 2, Room.newRegularInstance());
        dungeon.putRoom(-1, 3, Room.newRegularInstance());
        dungeon.putRoom(0, 3, Room.newRegularInstance());
        dungeon.putRoom(1, 3, Room.newRegularInstance());
        dungeon.putRoom(0, 4, Room.newBossInstance());
        dungeon.currentRoom = dungeon.getRoom(0, 0);
        return dungeon;
    }

}
