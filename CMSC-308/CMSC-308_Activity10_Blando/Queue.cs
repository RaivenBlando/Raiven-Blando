using System;
using System.Collections.Generic;

class Program{
    public static Queue<string> elements = new Queue<string>();
    
    static void addElement(string element){
            Program.elements.Enqueue(element);
    }
    
    static void removeElement(){
            Program.elements.Dequeue();
    }
    
    static void search(string missing){
           
        foreach (string item in Program.elements)
        {
            if(item == missing){
                   Console.Write("Item Found: ");
                   Console.WriteLine(item);
                   return;
                   
            }
         
        }
           Console.WriteLine("Element not found");
    }
    
    
    static void display(){
        
        int index = 0;
        
         Console.Write("Queue : {");
         
   
        foreach (string item in Program.elements)
        {
            Console.Write(item);
            if(index++ == Program.elements.Count-1)continue;
            Console.Write(",");
        }
        
         Console.Write("}\n");
    }
    
    static void Main() {
     
                Console.WriteLine("=====Menu=====");
                Console.WriteLine("[1] Add an element");
                Console.WriteLine("[2] Remove front element");
                Console.WriteLine("[3] Search for an element");
                Console.WriteLine("[4] Display Queue elements");
                Console.WriteLine("[5] Exit");
                
     bool run = true;
     
     
       
     while(run){
            
            Console.Write("Enter: ");
      int choice = Int32.Parse(Console.ReadLine());
      
      switch(choice){
          case 1:
           Console.Write("Add Element: ");
           addElement(Console.ReadLine());
          break;
           case 2:
          removeElement();
          break;
           case 3:
           Console.Write("Search Element: ");
           search(Console.ReadLine());
          break;
           case 4:
          display();
          break;
           case 5:
          run = false;
          Console.WriteLine("Program Finish");
          break;
          
      }
      
     }
    }
}