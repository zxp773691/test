package day10;

import java.io.File;

public class tree {
//  │━  ─  │  ├ ─ └ 
	public static void main(String args[]){
		File file=new File("F:\\坦克世界盒子");
		treeFat(file);
	}
	public static void treeFat(File file){
		File files[]=file.listFiles();
		if(files[0]==null){
			return ;
		}
		System.out.println("F:.");
		int level=0;
		int b[]=new int[100];
		treeSonalpha(files,level,b);
	}
//	public static void treeSon(File files[],int level,int b[]){
//		if(files[0]==null){
//			return ;
//		}
//		int dirNum=0;
//		int i=0;
//		for(File file:files){
//			if(file.isDirectory()){
//				dirNum++;
//			}
//		}
//		for(File file2:files){
//			if(file2.isDirectory()){
//				if((i+1)==dirNum){
//					b[level+1]=1;
//					outendalpha(level,b);
//					System.out.println(file2.getName());
//					treeSonalpha(file2.listFiles(),level+1,b);
////					alpha=0;
//					return ;
//				}
//				out(level);
//				System.out.println(file2.getName());
//				treeSon(file2.listFiles(),level+1,b);
//				i++;
//			}
//		}
//	}
	public static void treeSonalpha(File files[],int level,int b[]){
		if(files[0]==null){
			return ;
		}
		int dirNum=0;
		int i=0;
		for(File file:files){
			if(file.isDirectory()){
				dirNum++;
			}
		}
		for(File file2:files){
			if(file2.isDirectory()){
				if((i+1)==dirNum){
					b[level]=1;
					outendalpha(level,b);
					System.out.println(file2.getName());
					treeSonalpha(file2.listFiles(),level+1,b);
					b[level]=0;
					return ;
				}
				outalpha(level,b);
				System.out.println(file2.getName());
				treeSonalpha(file2.listFiles(),level+1,b);
				i++;
			}
		}
	}
//	public static void out(int level){
//		for(int i=0;i<=level;i++){
//			if(i==level){
//				System.out.print("├───");
//				return ;
//			}
//			System.out.print("│   ");
//		}
//	}
//	public static void outend(int level){
//		for(int i=0;i<=level;i++){
//			if(i==level){
//				System.out.print("└───");
//				return ;
//			}
//			System.out.print("│   ");
//		}
//	}
	public static void outendalpha(int level,int b[]){
		for(int i=0;i<=level;i++){
			if(i==level){
				System.out.print("└───");
				return ;
			}
			if(b[i]!=0){
				System.out.print("    ");
				continue;
			}
			System.out.print("│   ");
		}
	}
	public static void outalpha(int level,int b[]){
		for(int i=0;i<=level;i++){
			if(i==level){
				System.out.print("├───");
				return ;
			}
			if(b[i]!=0){
				System.out.print("    ");
				continue;
			}
			System.out.print("│   ");
		}
	}
}
