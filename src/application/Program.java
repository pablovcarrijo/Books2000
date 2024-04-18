package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Books;

public class Program {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Enter full path name: ");
	
		String path = sc.next();
		
		List<Books> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String reader = br.readLine();
			
			while(reader != null) {
				
				String[] vect = reader.split(", ");
				String title = vect[0];
				String author = vect[1];
				String age = vect[2];
				
				list.add(new Books(title, author, Integer.parseInt(age)));
				
				reader = br.readLine();
			}
			
			System.out.println("Livros publicados após 2000, ordenado por autor e título: ");
			List<Books> booksFilter = list.stream()
					.filter(p -> p.getAge() >= 2000)
					.collect(Collectors.toList());
			
			for(Books bf : booksFilter) {
				System.out.println("Autor: " + bf.getAuthor() + "; Title: " + bf.getTitle() + "; Age: " + bf.getAge());
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
		
	}
	
}
