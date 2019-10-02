package inlämning_1.Nackademin;

public enum Names {

    //typ 1 = hund, typ 2 = katt och typ 3 = orm.
    SIXTEN(1,5),DOGGE(1,10),VENUS(2,5),OVE(2,3),HYPNO(3,1);
    int type;
    int weight;
    Names(int type, int weight){
        this.type = type;
        this.weight = weight;
    }
}
