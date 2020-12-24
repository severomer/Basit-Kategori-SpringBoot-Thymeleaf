package com.os;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.os.Category;

@Service
public class CatService {

	private List<Category> catList = new ArrayList<Category>();


//	this.catList.add(Araba);

	public CatService() {

		Category Araba = new Category(1, "Araba", 1);
		this.catList.add(Araba);
		Category Honda = new Category(11, "Honda", 2, 1);
		this.catList.add(Honda);
		Category BMW = new Category(12, "BMW", 2, 1);
		this.catList.add(BMW);
		Category Elegance = new Category(111, "Elegance", 3, 11);
		this.catList.add(Elegance);
		Category Superb = new Category(121, "Superb", 3, 12);
		this.catList.add(Superb);
		
		Category Ev = new Category(2, "Ev", 1);
		Category Daire = new Category(21, "Daire", 2, 2);
		Category Daire2arti1 = new Category(211, "Daire2arti1", 3, 21);
		Category Daire3arti1 = new Category(212, "Daire2arti1", 3, 21);
		Daire.setParent(Ev);
		
		this.catList.add(Ev);
		this.catList.add(Daire);
		this.catList.add(Daire2arti1);
		this.catList.add(Daire3arti1);
		this.catList.get(1).addSubCat(Daire);
	}

	public void addCat(Category cat) {
		this.catList.add(cat);
	}
	
	public List<Category> getCatList() {
		return catList;
	}
	
	public List<Category> getSubCatList(int id) {
		List<Category> subCatList = new ArrayList<Category>();
		for(Category c : this.catList) {
			if(c.getParentid() == id) {
				subCatList.add(c);
				System.out.println("in service subcat:" + id + " parentid" + c.getParentid());
			}
		}
			
		return subCatList;
	}
	
	public List<Category> getFirstCatList() {
		List<Category> subCatList = new ArrayList<Category>();
		for(Category c : this.catList) {
			if(c.getLevel() == 1) {
				subCatList.add(c);
				System.out.println("in service first:");
			}
		}
			
		return subCatList;
	}
	public void setCatList(List<Category> catList) {
		this.catList = catList;
	}
	
	
}
