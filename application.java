package application;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.ArrayList;

import analyseur.*;

public class application {
	public static void main(String args[]) {
		JavaParser parser;
		SimpleFileVisitor sfv;
		

		if (args.length != 1) {
			System.out.println("Mauvais arguments pour Main..");
			return; // crash and burn
		}
		try {
			ArrayList<Classe> listeClasse=new ArrayList<>();
			//Files.walkFileTree(args[0], sfv);
			parser = new JavaParser(args[0],listeClasse);
			parser.init();
			parser.CompilationUnit();
			System.out.println("Java Parser Version 1.7:  Java program parsed successfully.");
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			System.out.println("Java Parser Version 1.7:  Encountered errors during parse.");
		} 
	}
}
//simple file visitor
//files.walkDirectory (new sfv()..


//visitor repertoire
//files.isDir