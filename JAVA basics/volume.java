class area{

int rarea(int a, int b){
int room_area=a*b;
return (room_area);
}
}
public class volume extends area{

int rvolume(int a, int b, int c){
int room_volume=a*b*c;
return (room_volume);
}

public static void main (String[]args){
volume v=new volume();
int x=v.rarea(50,40);
int y=v.rvolume(50,40,90);
System.out.println("arae:"+x);
System.out.println("arae:"+y);
}
}

