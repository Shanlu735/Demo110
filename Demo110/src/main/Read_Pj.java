package main;

import java.util.ArrayList;

public class Read_Pj implements Read_Pj_Interface {
	Pj_Interface si;
	public void set_Sort_Interface(Pj_Interface si){
	this.si=si;
	}
	@Override
	public int[] readpj(ArrayList list) {
		int[] arr = read(list);
		return pj(arr);
	}
	public int[] read(ArrayList list){
		int[] arr =  new int[list.size()];
		for(int i=0;i<list.size();i++){
			arr[i] = (int)list.get(i);
		}
		return arr;
	}
   public int[] pj(int[] arr){

	return si.pj(arr);
}
}
