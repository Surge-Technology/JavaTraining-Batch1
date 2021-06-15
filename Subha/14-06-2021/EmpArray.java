package arraylist;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

class CombineArrlist{
	
	public ArrayList<String> getMaleEmp() {
		
		ArrayList<String>arr=new ArrayList<>();
		arr.add("abi");
		arr.add("bala");
		arr.add("ram");
		return arr;
	}
	public ArrayList<String>getFemaleEmp(){
		
		ArrayList<String>arr1=new ArrayList<>();
		arr1.add("sri");
		arr1.add("hanu");
		arr1.add("suba");
		return arr1;
	}
	public  ArrayList<String>joinArrList(ArrayList<String>arr,ArrayList<String>arr1){
		ArrayList<String>combinearr=new ArrayList<>();
		for(int i=0;i<arr.size();i++) {
			combinearr.add(arr.get(i));
		}
		for(int j=0;j<arr1.size();j++) {
			combinearr.add(arr1.get(j));
		}
		return combinearr;
	
	}
}

public class EmpArray {

	public static void main(String[] args) {
		
		CombineArrlist c=new CombineArrlist();
		ArrayList<String>mArray=c.getMaleEmp();
		ArrayList<String>fArray=c.getFemaleEmp();
		ArrayList<String>joinarr=c.joinArrList(mArray,fArray);	
		for(String item:joinarr) {
			System.out.println("combined array:"+item);
		}

}
}
