package com.LibraryManagement.BooksTrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.LibraryManagement.Data.BooksDatalist;


@SpringBootApplication
public class BooksTrackApplication {
int n=5;
	public static void main(String[] args) {
		//SpringApplication.run(BooksTrackApplication.class, args);
		int bookNumber[]= {101,102,103,104,105};
		String bookName[]= {"Doctor of Hope","Aliens and Armies","Warriors and Trees","Dukes of Darkness","Knight of night"};
		String bookAuthor[]= { "Allan","Tagore","Roald","Ernest","Seuss"};
		BooksTrackApplication books=new BooksTrackApplication();
		books.addValues(bookNumber,bookName,bookAuthor);
		
	}
	private void addValues(int[] bookNumber, String[] bookName, String[] bookAuthor) {
		// TODO Auto-generated method stub
		ArrayList<BooksDatalist> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(new BooksDatalist(bookNumber[i],bookName[i],bookAuthor[i]));
		}
		printValues(list);
		
	}
	public void printValues(ArrayList<BooksDatalist> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			BooksDatalist data=list.get(i);
			System.out.println(data.bookNumber+" "+data.bookName+" "+data.bookAuthor);
		}
	}

}
