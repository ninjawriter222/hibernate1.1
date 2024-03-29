package Pojo;
// Generated Jun 22, 2019 7:24:36 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categories generated by hbm2java
 */
public class Categories  implements java.io.Serializable {


     private Integer categoryId;
     private String categoryName;
     private Set inventories = new HashSet(0);

    public Categories() {
    }

	
    public Categories(String categoryName) {
        this.categoryName = categoryName;
    }
    public Categories(String categoryName, Set inventories) {
       this.categoryName = categoryName;
       this.inventories = inventories;
    }
   
    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Set getInventories() {
        return this.inventories;
    }
    
    public void setInventories(Set inventories) {
        this.inventories = inventories;
    }




}


