/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class AplikasiTodolist {
    
    public static String[]model = new String[10];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        testAddTodoList();
        
    } 
    
    /**
     * menampilkan todo list
     */
     public static void showTodoList(){
         for (var i = 0; i <model.length;i++){
             var todo = model [i];
             var no = i+1;
             
             if(todo!= null){
                 System.out.println(no+"."+todo);
             }
         }
     }
     
     public static void testShowTodoList(){
         showTodoList();
     }
     
     /**
     * menambah todo ke list
     */
     public static void addTodoList(){
         
         //tambahkan ke posiis yang data array nya NULL
         for (var i = 0; i < model.length; i++) {
             if (model[i] == null){
                 model[i] = todo;
                 break;
             }
         }
     }
     public static void addTodolist(String todo) {
         // cek apakah modle penuh?
         var isFull = true;
         for (int i = 0; i < model.length; i++) {
             if (model[i] == null){
                 // model msih ada yang kosong
                 isFull = false;
                 break;
             }
         }
         
         // jika penuh, kita resize ukuran array 2x lipat
         if (isFull){
             var temp = model; 
             model =new String[model.length * 2];
             
             for (int i = 0; i < temp.length; i++) {
                 model[i] = temp[i];
             } 
         }
         //tambahkasn ke posisi yang data array nya NULL
         for(var i = 0; i < model.length; i++){
             if (model[i] == null) {
                 model[i] == todo;
                 break;
             }
         }
     }
     public static void testAddTodoList() {
         for(int i = 0; i < 25; i++){
             addTodoList("Contoh todo KE." + i);
         }
         
         showTodoList();
     }
     
     /**
     * menghapus todo dari list
     */
     
     public static boolean removeTodoList(Interger number){
         if((number - 1) >= model.length){
             return false;
         } else if (model(number - 1) == ) {
             return false;
         }else {
             for (int i = (number - 1); i < model.length; i++){
                 if (i == (model.length - 1)) {
                     model[i] = null;
                 }else {
                     model[i] = model[i + 1];
                 }
             }
             return true;
         }
     }
     /**
     * menampilakan menu todo list
     */
     public static void viewShowTodoList(){
     }
     
     /**
     * menampilkan view menambahkan todolist
     */
     public static void viewAddTodoList(){
     }
     
     /**
     * menampilkan view menghapus todolist
     */
     public static void viewRemoveTodoList(){
     }
     
}
