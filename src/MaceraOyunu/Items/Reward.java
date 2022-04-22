package MaceraOyunu.Items;

public class Reward {
    private int id;
    private String name;

    public Reward(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Reward[] Rewards() {

        Reward[] rewardList = new Reward[3];
        rewardList[0] = new Reward(1, "Yemek");
        rewardList[1] = new Reward(2, "Odun");
        rewardList[2] = new Reward(3, "Water");
        return rewardList;
    }

    public static Reward getRewardById(int id) {

        for (Reward w : Reward.Rewards()) {
            if (w.getId() == id) {
                return w;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
