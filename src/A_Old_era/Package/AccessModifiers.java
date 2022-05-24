package A_Old_era.Package;

public class AccessModifiers {

    protected String str;


    public AccessModifiers(String str) {
        this.str = str;
    }

    private void showStr() {
        System.out.println(this.str);
    }

    protected void show() {
        this.showStr();
    }

}
