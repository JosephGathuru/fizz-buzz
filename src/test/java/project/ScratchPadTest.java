package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScratchPadTest {

    @Test
    public void counttoTen(){
        for ( int i =0; i<10; i++){
            System.out.println(i);
            }
    }

    @Test
    public void whileLoopCountToTen(){
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }
        assertEquals(10, i);
        assertEquals(i, 10);{
        }
}}



