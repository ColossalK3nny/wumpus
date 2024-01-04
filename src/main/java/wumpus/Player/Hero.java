package wumpus.Player;

public class Hero {
    private char heroDirection;
    private int arrows;
    private boolean hasGold = false;

    public Hero(char heroDirection, int initialArrows) {
        this.heroDirection = heroDirection;
        this.arrows = initialArrows;
    }

    public void turnRight() {
        switch (heroDirection) {
            case 'N': heroDirection = 'E'; break;
            case 'E': heroDirection = 'S'; break;
            case 'S': heroDirection = 'W'; break;
            case 'W': heroDirection = 'N'; break;
        }
    }

    public void turnLeft() {
        switch (heroDirection) {
            case 'N': heroDirection = 'W'; break;
            case 'E': heroDirection = 'N'; break;
            case 'S': heroDirection = 'E'; break;
            case 'W': heroDirection = 'S'; break;
        }
    }

    public char getHeroDirection() {
        return heroDirection;
    }

    public void printHeroDirection() {
        String directionArrow;
        switch (heroDirection) {
            case 'N': directionArrow = "↑ (North)"; break;
            case 'E': directionArrow = "→ (East)"; break;
            case 'S': directionArrow = "↓ (South)"; break;
            case 'W': directionArrow = "← (West)"; break;
            default: directionArrow = "Unknown";
        }
        System.out.println("Hero's direction: " + directionArrow);
    }

    public void shootArrow() {
        if (arrows > 0) {
            arrows--;
        } else {

        }
    }

    public void fallIntoPit() {
        if (arrows > 0) {
            arrows--;
            System.out.println("Beleestél a verembe és elhagytál egy nyilat.");
        } else {
            System.out.println("Már minden nyiladat elhagytad.");
        }
    }

    public int getArrows() {
        return arrows;
    }

    public void pickUpGold() {
        hasGold = true;
    }

    public boolean hasGold() {
        return hasGold;
    }
}
