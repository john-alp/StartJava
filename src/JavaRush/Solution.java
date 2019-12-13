package JavaRush;

class Man {
    public int fuck(Woman woman) {
        return woman.setFucked(2);
    }
}
class Woman {
    private int fucked = 0;
    public int getFucked() {
        return fucked;
    }
    public int setFucked(int fucked) {
        return this.fucked += fucked;
    }
}
public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man();
        Woman woman1 = new Woman();
        man1.fuck(woman1);
        System.out.println(woman1.getFucked());
    }
}
//На примерах из реальной жизни лучше приходит понимание взаимодействия объектов))