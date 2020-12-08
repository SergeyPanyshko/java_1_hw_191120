package hw6.animals;

public  class Animals {
    String name;

    int limitRun;
    int limitSwim;

    public void run (int dis){
        if (dis <= limitRun) {
            System.out.println( name + " Пробежала " + dis +" м");
        }else {
            System.out.println( name + " Это растояние бежать не может " );
        }
    }
    public void swim (int dis){
        if (limitSwim == 0) {
            System.out.println( name + " Не умеет плавать ");
            return;
        }
        if (dis <= limitSwim){
            System.out.println( name + " Проплыл " + dis + " м");
        }
        else {
            System.out.println( name + " Это растояние плыть не может " );
        }
    }

    public Animals(String name, int limitRun, int limitSwim) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
    }
}
