package com.os;

import java.util.ArrayList;
import java.util.List;

public class Category {

	private int id;
	private String name;
	private int level;
	private int parentid;
	private Category parent;
	private List<Category> subCat = new ArrayList<Category>();
	
	public void addSubCat(Category subC) {
		this.subCat.add(subC);
	}
	
	public Category(int id, String name, int level, Category parent, List<Category> subCat) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.parent = parent;
		this.subCat = subCat;
	}
	
	
	
	public Category(int id, String name, int level) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
	}



	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public Category(int id, String name, int level, int parentid) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.parentid = parentid;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Category getParent() {
		return parent;
	}
	public void setParent(Category parent) {
		this.parent = parent;
	}
	public List<Category> getSubCat() {
		return subCat;
	}
	public void setSubCat(List<Category> subCat) {
		this.subCat = subCat;
	}

	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	
}
