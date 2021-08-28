/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nourhan Khalid
 */
 
import java.util.Scanner;

public  abstract  class Person{
   private String name;
   private float age;
   private String password;
  private String email;
   
   
    public Person(){
        
    }
    
    public Person(String name){
        this.name=name;
    }
     public Person(String name,String password,String email){
        this.name=name;
        this.password=password;
        this.email=email;
    }
    public Person(String name,float age){
     this.name=name;
     this.age=age;
     
 }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    
  
 }
    
  
class Galleryowner extends Person {
   private Artist artist;
    private Customer customer;
    public Galleryowner(String name,String password,String email){
        super(name,password,email);
    }
    public void addartist(Artist a,String n,String b,int g,String st){
        a.setName(n);
        a.setBirthplace(b);
        a.setAge(g);
        a.setStyle_of_art(st);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    //sql function creating by mysql program and inserted in the database
    public Customer displaycustomerinfo(){
        return customer;
    }
    
     //sql function creating by mysql program and inserted in the database
    public void addArtwork(){
        
    }
    
     //sql function creating by mysql program and inserted in the database
    public void addartist(){
        
    }
    
    /*sql function creating by mysql programe and inserted in the database
    can insert all the data of new art work
    */
    /*
    public void insertname_of_artwork(){
        
    }
      public void insertYearof_artwork(int year) {
      
    }

    public void inserttitleof_artwork(String title) {
       
    }

    public void inserttypeof_artwork(String type_of_art) {
      
    }

    public void insertpriceof_artwork(float price) {
      
    }

    public void setBirthplace(String birthplace) {
       
    }

    public void setStyle_of_art(String style_of_art) {
        
    }
    */
}
class Artist extends Person{ 
   private String birthplace;
   private String style_of_art;
    
   public Artist(){
        
    }
   public Artist(String name){
       super(name);
   }
    public Artist(String name,float age,String birthplace,String style_of_art ){
        super(name,age);
        this.birthplace=birthplace;
        this.style_of_art=style_of_art;
        
    }

    
      public void addArtist(){
           /*
      Scanner input=new Scanner(System.in);
      System.out.println("enter the name of the artist");
        String n=input.next();
        setName(n);
     System.out.println("enter the age of the artist");
       float age=input.nextFloat();
       setAge(age);
        System.out.println("enter the birth place of the artist");
     birthplace=input.next();
       System.out.println("enter the style of the art");
     style_of_art=input.next();
      */
  } 

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public void setStyle_of_art(String style_of_art) {
        this.style_of_art = style_of_art;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getStyle_of_art() {
        return style_of_art;
    }
      
      
}

class Customer extends Person{
   private static float totalamount_of_Dollar_spent_on_gallery;
   private  String address;
  
   
    Customer(){
        
    }
    Customer(String name,String address,float totalamount_of_Dollar_spent_on_gallery,String password,String email){
        super(name,password,email);
        this.address=address;
        this.totalamount_of_Dollar_spent_on_gallery=totalamount_of_Dollar_spent_on_gallery;
    }

    public static float getTotalamount_of_Dollar_spent_on_gallery() {
        return totalamount_of_Dollar_spent_on_gallery;
    }

    public String getAddress() {
        return address;
    }
    
 
    //sql function creating by mysql programe and inserted in the database
    
      public void addcustomer(){
          /*
     Scanner input=new Scanner(System.in);
      System.out.println("enter the name ");
        String n=input.next();
        setName(n);
     
   
        System.out.println("enter the address ");
        address=input.next();
       System.out.println("enter the totalamount of Dollar spent on gallery;");
      totalamount_of_Dollar_spent_on_gallery=input.nextFloat();
      */
  }

    public static void setTotalamount_of_Dollar_spent_on_gallery(float totalamount_of_Dollar) {
        totalamount_of_Dollar_spent_on_gallery = totalamount_of_Dollar;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
    
    //sql function creating by mysql program and inserted in the database
    public void insertdatacustomer(){
        
    }
    //sql function creating by mysql program and inserted in the database
    public void puyartwork(){
        
    }
    //sql function creating by mysql program and inserted in the database
    public void searchartwork_bycategory(){
        
    }
    
    }
  

   
    
  abstract class Artwork extends Artist {
      
 private int year;
 private String title;
 private String type_of_art; 
 private float price;
 
public Artwork(){
    
}
public Artwork(String name,int year,String title,String type_of_art,float price){
    super(name);
    this.year=year;
    this.title=title;
    this.type_of_art=type_of_art;
    this.price=price;
    
   
}
   




//sql function creating by mysql programe and inserted in the database
 public abstract void addArtwork();
      
      //sql function creating by mysql programe and inserted in the database
   public abstract void updateprice(float price);

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType_of_art(String type_of_art) {
        this.type_of_art = type_of_art;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getType_of_art() {
        return type_of_art;
    }

    public float getPrice() {
        return price;
    }
/*
      Scanner input=new Scanner(System.in);
      System.out.println("enter the title of the art work");
      title=input.next();
        System.out.println("enter the year of the art work");
        year=input.nextInt();
        System.out.println("enter tyoe of the art work");
      type_of_art=input.next();
        System.out.println("enter the title of the art work");
      price=input.nextFloat();
              */
    
}

class Statues extends Artwork{
   private String materialof_statue;
   private String road_tools;
   private float dimentionsof_stastue;
   private String typeof_chisel;
   
   public Statues(String name,int year, String title,String type_of_art, float price, String materialof_statue,String road_tools,float dimentionsof_stastue,String typeof_chisel ){
        
         super(name,year,title,type_of_art,price);
        
         this.road_tools=road_tools;
          this. dimentionsof_stastue=dimentionsof_stastue;
          this.typeof_chisel=typeof_chisel;
        
         this.materialof_statue=materialof_statue;
    }
   //sql function creating by mysql program and inserted in the database
       public void addArtwork  (){
           
       }  
       //sql function creating by mysql program and inserted in the database
       public void updateprice(float price){
           
       } 

    public void setMaterialof_statue(String materialof_statue) {
        this.materialof_statue = materialof_statue;
    }

    public void setRoad_tools(String road_tools) {
        this.road_tools = road_tools;
    }

    public void setDimentionsof_stastue(float dimentionsof_stastue) {
        this.dimentionsof_stastue = dimentionsof_stastue;
    }

    public void setTypeof_chisel(String typeof_chisel) {
        this.typeof_chisel = typeof_chisel;
    }

    public String getMaterialof_statue() {
        return materialof_statue;
    }

    public String getRoad_tools() {
        return road_tools;
    }

    public float getDimentionsof_stastue() {
        return dimentionsof_stastue;
    }

    public String getTypeof_chisel() {
        return typeof_chisel;
    }
       
       
    
}



class Decoration extends Artwork{
    

    public Decoration(String name,int year, String title,String type_of_art, float price) {
         super(name,year,title,type_of_art,price);
    }
    //sql function creating by mysql program and inserted in the database
       public void addArtwork  (){
           
       } 
       //sql function creating by mysql program and inserted in the database
       public void updateprice(float price){
           
       } 

  
    
}


abstract class  Paintings extends Artwork{

    private String material_of_papers;
   // private String matrial_of_cloth;
    
 
    public Paintings(String name,int year, String title,String type_of_art, float price, String material_of_papers){
        super(name,year,title,type_of_art,price);
        this.material_of_papers=material_of_papers;
    }
    

    public void setMatrial_of_papers(String matrial_of_papers) {
        this.material_of_papers = matrial_of_papers;
    }

    public String getMatrial_of_papers() {
        return material_of_papers;
    }

}
    
    class painting_by_pencils extends Paintings{
 private String typepencils;
 
    public painting_by_pencils(String name,int year, String title,String type_of_art, float price, String material_of_papers,String typepencils) {
        super( name,year,title,type_of_art,price, material_of_papers);
        this.typepencils=typepencils;
    }
     //sql function creating by mysql program and inserted in the database
       public void addArtwork  (){
           
       } 
       //sql function creating by mysql program and inserted in the database
       public void updateprice(float price){
           
       }

    public String getTypepencils() {
        return typepencils;
    }

    public void setTypepencils(String typepencils) {
        this.typepencils = typepencils;
    }
       
}


 
    class painting_by_brushes extends Paintings{
 private String typeof_brushdrawing;
 private String typeof_colors;
 
    public painting_by_brushes(String name,int year, String title,String type_of_art,float price, String material_of_papers, String typeof_brushdrawing,String typeof_colors) {
        super( name,year,title,type_of_art,price, material_of_papers);
      this.typeof_colors=typeof_colors ;
     this.typeof_brushdrawing=typeof_brushdrawing;
    }
     //sql function creating by mysql program and inserted in the database
       public void addArtwork  (){
           
       } 
       //sql function creating by mysql program and inserted in the database
       public void updateprice(float price){
           
       }

    public void setTypeof_brushdrawing(String typeof_brushdrawing) {
        this.typeof_brushdrawing = typeof_brushdrawing;
    }

    public void setTypeof_colors(String typeof_colors) {
        this.typeof_colors = typeof_colors;
    }

    public String getTypeof_brushdrawing() {
        return typeof_brushdrawing;
    }

    public String getTypeof_colors() {
        return typeof_colors;
    }
       
       
}
