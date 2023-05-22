/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical.classes;

/**
 *
 * @author deshp
 */
public class LogicalClass {
    private int length;
    private int breadth;

    @Override
    public String toString() {
        return "LogicalClass{" + "length=" + length + ", bredth=" + breadth + '}';
    }
    
    public int getArea(){
        return this.length*this.breadth;
    }        
    

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    
    
}
