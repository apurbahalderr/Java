class ObjectCount {
    static int count = 0;
    ObjectCount(){
        count = count + 1;
    }
}

public class CountMain{
	public static void main(String[] args){

		ObjectCount a = new ObjectCount();
		ObjectCount b = new ObjectCount();
		ObjectCount c = new ObjectCount();

		System.out.println(ObjectCount.count);
	}
}
