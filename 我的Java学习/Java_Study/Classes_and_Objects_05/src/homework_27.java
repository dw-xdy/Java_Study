public class homework_27 {
    public static void main(String[] args) {
        Music m = new Music("素颜", 300);
        m.play();
        System.out.println(m.getInfo());
    }
}

class Music {
    String name;
    int times;

    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public void play() {
        System.out.println("播放的音乐名称为：" + name + "播放时长为：" + times);
    }
    public String getInfo() {
        return "播放的音乐名称为：" + name + "播放时长为：" + times;
    }
}