public class Session2a {
    int width;
    int height;
    int depth;

    //constructor
    Session2a(int width ,int height,int depth){
        System.out.println("this is a constructor with 3 parameter");
        //this keyword
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //constructor
    Session2a(int w,int h){
        System.out.println("this is a constructor with 2 parameter");
        width = w;
        height = h;
        depth = 1;
    }

    void volume(){
        System.out.println(width*height*depth);
    }

    void setDim(int w,int h,int d){
        width = w;
        height = h;
        depth = d;
    }

    void setDim(int w,int h){
        width = w;
        height = h;
        depth = 1;
    }

}
