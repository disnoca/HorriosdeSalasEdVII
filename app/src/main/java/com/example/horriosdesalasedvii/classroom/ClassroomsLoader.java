package com.example.horriosdesalasedvii.classroom;

import java.util.ArrayList;

public class ClassroomsLoader {

    public static ArrayList<Classroom> getClassrooms() {
        ArrayList<Classroom> allClassrooms = new ArrayList<>();

        ArrayList<ClassBlock>[] weekTT11 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT11[i] = new ArrayList<>();
        weekTT11[1].add(new ClassBlock(2, hoursToMinutes(9,0), hoursToMinutes(12,30)));
        weekTT11[1].add(new ClassBlock(2, hoursToMinutes(13,30), hoursToMinutes(17,0)));
        weekTT11[2].add(new ClassBlock(3, hoursToMinutes(11,0), hoursToMinutes(13,0)));
        weekTT11[2].add(new ClassBlock(3, hoursToMinutes(13,30), hoursToMinutes(15,0)));
        weekTT11[2].add(new ClassBlock(3, hoursToMinutes(15,30), hoursToMinutes(17,0)));
        weekTT11[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(11,0)));
        weekTT11[3].add(new ClassBlock(4, hoursToMinutes(11,30), hoursToMinutes(13,0)));
        weekTT11[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(15,0)));
        weekTT11[4].add(new ClassBlock(5, hoursToMinutes(15,30), hoursToMinutes(17,0)));
        weekTT11[4].add(new ClassBlock(5, hoursToMinutes(17,30), hoursToMinutes(19,0)));
        weekTT11[5].add(new ClassBlock(6, hoursToMinutes(10,30), hoursToMinutes(13,0)));
        weekTT11[5].add(new ClassBlock(6, hoursToMinutes(14,0), hoursToMinutes(15,30)));
        allClassrooms.add(new Classroom("1.1", weekTT11));

        ArrayList<ClassBlock>[] weekTT12 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT12[i] = new ArrayList<>();
        weekTT12[1].add(new ClassBlock(2, hoursToMinutes(9,0), hoursToMinutes(13,0)));
        weekTT12[1].add(new ClassBlock(2, hoursToMinutes(14,0), hoursToMinutes(16,0)));
        weekTT12[2].add(new ClassBlock(3, hoursToMinutes(11,0), hoursToMinutes(14,30)));
        weekTT12[2].add(new ClassBlock(3, hoursToMinutes(15,0), hoursToMinutes(16,30)));
        weekTT12[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(9,0)));
        weekTT12[3].add(new ClassBlock(4, hoursToMinutes(10,0), hoursToMinutes(11,30)));
        weekTT12[3].add(new ClassBlock(4, hoursToMinutes(12,30), hoursToMinutes(14,0)));
        weekTT12[4].add(new ClassBlock(5, hoursToMinutes(9,30), hoursToMinutes(12,30)));
        weekTT12[4].add(new ClassBlock(5, hoursToMinutes(14,30), hoursToMinutes(18,0)));
        weekTT12[5].add(new ClassBlock(6, hoursToMinutes(9,30), hoursToMinutes(12,30)));
        weekTT12[5].add(new ClassBlock(6, hoursToMinutes(14,30), hoursToMinutes(16,0)));
        allClassrooms.add(new Classroom("1.2", weekTT12));

        ArrayList<ClassBlock>[] weekTT13 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT13[i] = new ArrayList<>();
        weekTT13[1].add(new ClassBlock(2, hoursToMinutes(8,30), hoursToMinutes(9,30)));
        weekTT13[1].add(new ClassBlock(2, hoursToMinutes(10,0), hoursToMinutes(13,0)));
        weekTT13[1].add(new ClassBlock(2, hoursToMinutes(14,0), hoursToMinutes(17,0)));
        weekTT13[2].add(new ClassBlock(3, hoursToMinutes(10,0), hoursToMinutes(14,0)));
        weekTT13[2].add(new ClassBlock(3, hoursToMinutes(15,0), hoursToMinutes(17,30)));
        weekTT13[2].add(new ClassBlock(3, hoursToMinutes(18,0), hoursToMinutes(20,0)));
        weekTT13[3].add(new ClassBlock(4, hoursToMinutes(11,0), hoursToMinutes(13,0)));
        weekTT13[3].add(new ClassBlock(4, hoursToMinutes(16,0), hoursToMinutes(20,0)));
        weekTT13[4].add(new ClassBlock(5, hoursToMinutes(8,30), hoursToMinutes(9,30)));
        weekTT13[4].add(new ClassBlock(5, hoursToMinutes(10,0), hoursToMinutes(12,0)));
        weekTT13[4].add(new ClassBlock(5, hoursToMinutes(14,0), hoursToMinutes(17,0)));
        weekTT13[5].add(new ClassBlock(6, hoursToMinutes(9,0), hoursToMinutes(11,0)));
        weekTT13[5].add(new ClassBlock(6, hoursToMinutes(11,30), hoursToMinutes(13,30)));
        weekTT13[5].add(new ClassBlock(6, hoursToMinutes(14,0), hoursToMinutes(15,30)));
        weekTT13[5].add(new ClassBlock(6, hoursToMinutes(17,0), hoursToMinutes(19,0)));
        allClassrooms.add(new Classroom("1.3", weekTT13));

        ArrayList<ClassBlock>[] weekTT14 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT14[i] = new ArrayList<>();
        weekTT14[1].add(new ClassBlock(2, hoursToMinutes(8,30), hoursToMinutes(9,30)));
        weekTT14[1].add(new ClassBlock(2, hoursToMinutes(10,0), hoursToMinutes(12,30)));
        weekTT14[1].add(new ClassBlock(2, hoursToMinutes(13,0), hoursToMinutes(18,30)));
        weekTT14[2].add(new ClassBlock(3, hoursToMinutes(9,30), hoursToMinutes(13,0)));
        weekTT14[2].add(new ClassBlock(3, hoursToMinutes(16,0), hoursToMinutes(18,30)));
        weekTT14[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(10,0)));
        weekTT14[3].add(new ClassBlock(4, hoursToMinutes(11,0), hoursToMinutes(13,0)));
        weekTT14[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(11,30)));
        weekTT14[4].add(new ClassBlock(5, hoursToMinutes(15,0), hoursToMinutes(16,0)));
        weekTT14[4].add(new ClassBlock(5, hoursToMinutes(16,30), hoursToMinutes(18,30)));
        weekTT14[5].add(new ClassBlock(6, hoursToMinutes(8,30), hoursToMinutes(12,30)));
        weekTT14[5].add(new ClassBlock(6, hoursToMinutes(14,30), hoursToMinutes(16,30)));
        allClassrooms.add(new Classroom("1.4", weekTT14));

        ArrayList<ClassBlock>[] weekTT15 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT15[i] = new ArrayList<>();
        weekTT15[1].add(new ClassBlock(2, hoursToMinutes(9,0), hoursToMinutes(13,0)));
        weekTT15[1].add(new ClassBlock(2, hoursToMinutes(13,30), hoursToMinutes(18,30)));
        weekTT15[2].add(new ClassBlock(3, hoursToMinutes(8,0), hoursToMinutes(12,30)));
        weekTT15[2].add(new ClassBlock(3, hoursToMinutes(14,0), hoursToMinutes(17,0)));
        weekTT15[2].add(new ClassBlock(3, hoursToMinutes(18,0), hoursToMinutes(20,0)));
        weekTT15[3].add(new ClassBlock(4, hoursToMinutes(9,0), hoursToMinutes(11,0)));
        weekTT15[3].add(new ClassBlock(4, hoursToMinutes(12,30), hoursToMinutes(14,0)));
        weekTT15[4].add(new ClassBlock(5, hoursToMinutes(9,0), hoursToMinutes(10,30)));
        weekTT15[4].add(new ClassBlock(5, hoursToMinutes(11,0), hoursToMinutes(12,30)));
        weekTT15[4].add(new ClassBlock(5, hoursToMinutes(14,0), hoursToMinutes(16,30)));
        weekTT15[5].add(new ClassBlock(6, hoursToMinutes(9,0), hoursToMinutes(11,0)));
        weekTT15[5].add(new ClassBlock(6, hoursToMinutes(15,0), hoursToMinutes(18,0)));
        allClassrooms.add(new Classroom("1.5", weekTT15));

        ArrayList<ClassBlock>[] weekTT16 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT16[i] = new ArrayList<>();
        weekTT16[1].add(new ClassBlock(2, hoursToMinutes(9,0), hoursToMinutes(13,0)));
        weekTT16[1].add(new ClassBlock(2, hoursToMinutes(16,30), hoursToMinutes(18,30)));
        weekTT16[2].add(new ClassBlock(3, hoursToMinutes(8,0), hoursToMinutes(13,0)));
        weekTT16[2].add(new ClassBlock(3, hoursToMinutes(14,30), hoursToMinutes(19,0)));
        weekTT16[3].add(new ClassBlock(4, hoursToMinutes(8,30), hoursToMinutes(10,0)));
        weekTT16[3].add(new ClassBlock(4, hoursToMinutes(11,30), hoursToMinutes(13,30)));
        weekTT16[4].add(new ClassBlock(5, hoursToMinutes(8,30), hoursToMinutes(12,0)));
        weekTT16[4].add(new ClassBlock(5, hoursToMinutes(13,30), hoursToMinutes(17,30)));
        weekTT16[5].add(new ClassBlock(6, hoursToMinutes(10,0), hoursToMinutes(12,30)));
        weekTT16[5].add(new ClassBlock(6, hoursToMinutes(14,0), hoursToMinutes(16,0)));
        allClassrooms.add(new Classroom("1.6", weekTT16));

        ArrayList<ClassBlock>[] weekTT17 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT17[i] = new ArrayList<>();
        weekTT17[1].add(new ClassBlock(2, hoursToMinutes(9,0), hoursToMinutes(11,0)));
        weekTT17[1].add(new ClassBlock(2, hoursToMinutes(11,30), hoursToMinutes(13,30)));
        weekTT17[1].add(new ClassBlock(2, hoursToMinutes(14,0), hoursToMinutes(18,0)));
        weekTT17[2].add(new ClassBlock(3, hoursToMinutes(9,30), hoursToMinutes(13,30)));
        weekTT17[2].add(new ClassBlock(3, hoursToMinutes(14,30), hoursToMinutes(16,30)));
        weekTT17[2].add(new ClassBlock(3, hoursToMinutes(17,0), hoursToMinutes(19,0)));
        weekTT17[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(11,0)));
        weekTT17[3].add(new ClassBlock(4, hoursToMinutes(12,0), hoursToMinutes(14,0)));
        weekTT17[4].add(new ClassBlock(5, hoursToMinutes(8,30), hoursToMinutes(10,30)));
        weekTT17[4].add(new ClassBlock(5, hoursToMinutes(11,0), hoursToMinutes(13,0)));
        weekTT17[4].add(new ClassBlock(5, hoursToMinutes(14,0), hoursToMinutes(17,0)));
        weekTT17[5].add(new ClassBlock(6, hoursToMinutes(9,0), hoursToMinutes(13,0)));
        weekTT17[5].add(new ClassBlock(6, hoursToMinutes(14,30), hoursToMinutes(16,30)));
        allClassrooms.add(new Classroom("1.7", weekTT17));

        ArrayList<ClassBlock>[] weekTT19 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT19[i] = new ArrayList<>();
        weekTT19[1].add(new ClassBlock(2, hoursToMinutes(9,0), hoursToMinutes(13,0)));
        weekTT19[1].add(new ClassBlock(2, hoursToMinutes(14,0), hoursToMinutes(17,30)));
        weekTT19[2].add(new ClassBlock(3, hoursToMinutes(8,0), hoursToMinutes(12,30)));
        weekTT19[2].add(new ClassBlock(3, hoursToMinutes(13,30), hoursToMinutes(15,0)));
        weekTT19[2].add(new ClassBlock(3, hoursToMinutes(16,0), hoursToMinutes(19,0)));
        weekTT19[3].add(new ClassBlock(4, hoursToMinutes(9,0), hoursToMinutes(13,0)));
        weekTT19[4].add(new ClassBlock(5, hoursToMinutes(8,30), hoursToMinutes(13,0)));
        weekTT19[4].add(new ClassBlock(5, hoursToMinutes(14,0), hoursToMinutes(15,30)));
        weekTT19[5].add(new ClassBlock(6, hoursToMinutes(9,0), hoursToMinutes(13,0)));
        weekTT19[5].add(new ClassBlock(6, hoursToMinutes(14,0), hoursToMinutes(18,0)));
        allClassrooms.add(new Classroom("1.9", weekTT19));

        ArrayList<ClassBlock>[] weekTT110 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT110[i] = new ArrayList<>();
        weekTT110[1].add(new ClassBlock(2, hoursToMinutes(9,0), hoursToMinutes(10,30)));
        weekTT110[1].add(new ClassBlock(2, hoursToMinutes(14,30), hoursToMinutes(19,0)));
        weekTT110[2].add(new ClassBlock(3, hoursToMinutes(9,0), hoursToMinutes(13,0)));
        weekTT110[2].add(new ClassBlock(3, hoursToMinutes(14,0), hoursToMinutes(16,0)));
        weekTT110[3].add(new ClassBlock(4, hoursToMinutes(11,0), hoursToMinutes(13,0)));
        weekTT110[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(10,0)));
        weekTT110[4].add(new ClassBlock(5, hoursToMinutes(10,30), hoursToMinutes(12,0)));
        weekTT110[4].add(new ClassBlock(5, hoursToMinutes(15,0), hoursToMinutes(16,30)));
        weekTT110[5].add(new ClassBlock(6, hoursToMinutes(9,0), hoursToMinutes(13,0)));
        weekTT110[5].add(new ClassBlock(6, hoursToMinutes(14,0), hoursToMinutes(16,0)));
        allClassrooms.add(new Classroom("1.10", weekTT110));

        ArrayList<ClassBlock>[] weekTT111 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT111[i] = new ArrayList<>();
        weekTT111[1].add(new ClassBlock(2, hoursToMinutes(8,0), hoursToMinutes(10,0)));
        weekTT111[1].add(new ClassBlock(2, hoursToMinutes(10,30), hoursToMinutes(13,0)));
        weekTT111[1].add(new ClassBlock(2, hoursToMinutes(13,30), hoursToMinutes(15,30)));
        weekTT111[1].add(new ClassBlock(2, hoursToMinutes(16,30), hoursToMinutes(18,30)));
        weekTT111[2].add(new ClassBlock(3, hoursToMinutes(8,0), hoursToMinutes(13,0)));
        weekTT111[2].add(new ClassBlock(3, hoursToMinutes(14,0), hoursToMinutes(15,30)));
        weekTT111[2].add(new ClassBlock(3, hoursToMinutes(16,0), hoursToMinutes(18,0)));
        weekTT111[3].add(new ClassBlock(4, hoursToMinutes(9,0), hoursToMinutes(14,0)));
        weekTT111[4].add(new ClassBlock(5, hoursToMinutes(9,0), hoursToMinutes(12,0)));
        weekTT111[4].add(new ClassBlock(5, hoursToMinutes(13,0), hoursToMinutes(18,0)));
        weekTT111[5].add(new ClassBlock(6, hoursToMinutes(10,30), hoursToMinutes(13,0)));
        weekTT111[5].add(new ClassBlock(6, hoursToMinutes(14,0), hoursToMinutes(17,0)));
        allClassrooms.add(new Classroom("1.11", weekTT111));

        ArrayList<ClassBlock>[] weekTT112 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT112[i] = new ArrayList<>();
        weekTT112[1].add(new ClassBlock(2, hoursToMinutes(12,0), hoursToMinutes(18,0)));
        weekTT112[2].add(new ClassBlock(3, hoursToMinutes(10,30), hoursToMinutes(13,0)));
        weekTT112[2].add(new ClassBlock(3, hoursToMinutes(14,30), hoursToMinutes(18,0)));
        weekTT112[3].add(new ClassBlock(4, hoursToMinutes(9,0), hoursToMinutes(14,0)));
        weekTT112[4].add(new ClassBlock(5, hoursToMinutes(8,30), hoursToMinutes(13,0)));
        weekTT112[4].add(new ClassBlock(5, hoursToMinutes(13,30), hoursToMinutes(15,30)));
        weekTT112[5].add(new ClassBlock(6, hoursToMinutes(10,0), hoursToMinutes(12,0)));
        allClassrooms.add(new Classroom("1.12", weekTT112));

        ArrayList<ClassBlock>[] weekTT113 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT113[i] = new ArrayList<>();
        weekTT113[1].add(new ClassBlock(2, hoursToMinutes(9,0), hoursToMinutes(13,0)));
        weekTT113[1].add(new ClassBlock(2, hoursToMinutes(14,0), hoursToMinutes(18,0)));
        weekTT113[2].add(new ClassBlock(3, hoursToMinutes(9,30), hoursToMinutes(13,0)));
        weekTT113[2].add(new ClassBlock(3, hoursToMinutes(13,30), hoursToMinutes(18,30)));
        weekTT113[3].add(new ClassBlock(4, hoursToMinutes(8,30), hoursToMinutes(13,0)));
        weekTT113[4].add(new ClassBlock(5, hoursToMinutes(9,0), hoursToMinutes(13,0)));
        weekTT113[4].add(new ClassBlock(5, hoursToMinutes(15,0), hoursToMinutes(17,0)));
        weekTT113[5].add(new ClassBlock(6, hoursToMinutes(10,30), hoursToMinutes(12,30)));
        allClassrooms.add(new Classroom("1.13", weekTT113));

        ArrayList<ClassBlock>[] weekTT114 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT114[i] = new ArrayList<>();
        weekTT114[1].add(new ClassBlock(2, hoursToMinutes(9,30), hoursToMinutes(12,30)));
        weekTT114[1].add(new ClassBlock(2, hoursToMinutes(14,0), hoursToMinutes(16,0)));
        weekTT114[2].add(new ClassBlock(3, hoursToMinutes(8,0), hoursToMinutes(12,30)));
        weekTT114[2].add(new ClassBlock(3, hoursToMinutes(14,0), hoursToMinutes(17,0)));
        weekTT114[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(13,30)));
        weekTT114[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(9,0)));
        weekTT114[4].add(new ClassBlock(5, hoursToMinutes(10,0), hoursToMinutes(11,30)));
        weekTT114[4].add(new ClassBlock(5, hoursToMinutes(12,0), hoursToMinutes(15,0)));
        weekTT114[4].add(new ClassBlock(5, hoursToMinutes(15,30), hoursToMinutes(17,0)));
        weekTT114[5].add(new ClassBlock(6, hoursToMinutes(11,0), hoursToMinutes(15,30)));
        allClassrooms.add(new Classroom("1.14", weekTT114));

        ArrayList<ClassBlock>[] weekTT115 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT115[i] = new ArrayList<>();
        weekTT115[1].add(new ClassBlock(2, hoursToMinutes(9,0), hoursToMinutes(10,30)));
        weekTT115[1].add(new ClassBlock(2, hoursToMinutes(11,30), hoursToMinutes(13,0)));
        weekTT115[1].add(new ClassBlock(2, hoursToMinutes(13,30), hoursToMinutes(15,0)));
        weekTT115[1].add(new ClassBlock(2, hoursToMinutes(15,30), hoursToMinutes(17,0)));
        weekTT115[2].add(new ClassBlock(3, hoursToMinutes(9,0), hoursToMinutes(10,30)));
        weekTT115[2].add(new ClassBlock(3, hoursToMinutes(11,30), hoursToMinutes(13,0)));
        weekTT115[2].add(new ClassBlock(3, hoursToMinutes(14,0), hoursToMinutes(16,30)));
        weekTT115[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(11,30)));
        weekTT115[3].add(new ClassBlock(4, hoursToMinutes(12,0), hoursToMinutes(14,0)));
        weekTT115[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(9,0)));
        weekTT115[4].add(new ClassBlock(5, hoursToMinutes(10,0), hoursToMinutes(11,30)));
        weekTT115[4].add(new ClassBlock(5, hoursToMinutes(14,0), hoursToMinutes(16,0)));
        weekTT115[5].add(new ClassBlock(6, hoursToMinutes(10,0), hoursToMinutes(12,30)));
        weekTT115[5].add(new ClassBlock(6, hoursToMinutes(13,30), hoursToMinutes(16,30)));
        allClassrooms.add(new Classroom("1.15", weekTT115));

        ArrayList<ClassBlock>[] weekTT116 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT116[i] = new ArrayList<>();
        weekTT116[1].add(new ClassBlock(2, hoursToMinutes(8,30), hoursToMinutes(10,0)));
        weekTT116[1].add(new ClassBlock(2, hoursToMinutes(10,30), hoursToMinutes(12,30)));
        weekTT116[1].add(new ClassBlock(2, hoursToMinutes(15,0), hoursToMinutes(18,0)));
        weekTT116[2].add(new ClassBlock(3, hoursToMinutes(8,0), hoursToMinutes(10,30)));
        weekTT116[2].add(new ClassBlock(3, hoursToMinutes(11,0), hoursToMinutes(13,0)));
        weekTT116[2].add(new ClassBlock(3, hoursToMinutes(14,0), hoursToMinutes(20,0)));
        weekTT116[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(11,0)));
        weekTT116[3].add(new ClassBlock(4, hoursToMinutes(11,30), hoursToMinutes(13,30)));
        weekTT116[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(10,30)));
        weekTT116[4].add(new ClassBlock(5, hoursToMinutes(11,0), hoursToMinutes(13,0)));
        weekTT116[4].add(new ClassBlock(5, hoursToMinutes(14,0), hoursToMinutes(16,0)));
        weekTT116[5].add(new ClassBlock(6, hoursToMinutes(8,30), hoursToMinutes(13,0)));
        allClassrooms.add(new Classroom("1.16", weekTT116));

        ArrayList<ClassBlock>[] weekTT117 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT117[i] = new ArrayList<>();
        weekTT117[1].add(new ClassBlock(2, hoursToMinutes(8,0), hoursToMinutes(9,0)));
        weekTT117[1].add(new ClassBlock(2, hoursToMinutes(9,30), hoursToMinutes(13,30)));
        weekTT117[1].add(new ClassBlock(2, hoursToMinutes(14,30), hoursToMinutes(16,0)));
        weekTT117[1].add(new ClassBlock(2, hoursToMinutes(16,30), hoursToMinutes(19,0)));
        weekTT117[2].add(new ClassBlock(3, hoursToMinutes(8,0), hoursToMinutes(13,0)));
        weekTT117[2].add(new ClassBlock(3, hoursToMinutes(14,0), hoursToMinutes(19,0)));
        weekTT117[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(14,0)));
        weekTT117[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(9,30)));
        weekTT117[4].add(new ClassBlock(5, hoursToMinutes(11,0), hoursToMinutes(17,0)));
        weekTT117[5].add(new ClassBlock(6, hoursToMinutes(8,0), hoursToMinutes(12,0)));
        weekTT117[5].add(new ClassBlock(6, hoursToMinutes(13,0), hoursToMinutes(14,30)));
        weekTT117[5].add(new ClassBlock(6, hoursToMinutes(16,0), hoursToMinutes(18,0)));
        allClassrooms.add(new Classroom("1.17", weekTT117));

        ArrayList<ClassBlock>[] weekTT119 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT119[i] = new ArrayList<>();
        weekTT119[1].add(new ClassBlock(2, hoursToMinutes(10,0), hoursToMinutes(12,0)));
        weekTT119[1].add(new ClassBlock(2, hoursToMinutes(13,30), hoursToMinutes(15,30)));
        weekTT119[1].add(new ClassBlock(2, hoursToMinutes(17,0), hoursToMinutes(19,0)));
        weekTT119[2].add(new ClassBlock(3, hoursToMinutes(9,0), hoursToMinutes(18,0)));
        weekTT119[3].add(new ClassBlock(4, hoursToMinutes(10,0), hoursToMinutes(14,0)));
        weekTT119[4].add(new ClassBlock(5, hoursToMinutes(13,30), hoursToMinutes(15,30)));
        weekTT119[4].add(new ClassBlock(5, hoursToMinutes(16,30), hoursToMinutes(19,30)));
        weekTT119[5].add(new ClassBlock(6, hoursToMinutes(8,0), hoursToMinutes(13,0)));
        weekTT119[5].add(new ClassBlock(6, hoursToMinutes(14,0), hoursToMinutes(18,0)));
        allClassrooms.add(new Classroom("1.19", weekTT119));

        ArrayList<ClassBlock>[] weekTT21 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT21[i] = new ArrayList<>();
        weekTT21[1].add(new ClassBlock(2, hoursToMinutes(8,0), hoursToMinutes(10,30)));
        weekTT21[1].add(new ClassBlock(2, hoursToMinutes(11,30), hoursToMinutes(15,0)));
        weekTT21[1].add(new ClassBlock(2, hoursToMinutes(15,30), hoursToMinutes(16,30)));
        weekTT21[2].add(new ClassBlock(3, hoursToMinutes(8,0), hoursToMinutes(12,0)));
        weekTT21[2].add(new ClassBlock(3, hoursToMinutes(13,0), hoursToMinutes(17,0)));
        weekTT21[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(14,0)));
        weekTT21[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(9,0)));
        weekTT21[4].add(new ClassBlock(5, hoursToMinutes(10,0), hoursToMinutes(12,0)));
        weekTT21[4].add(new ClassBlock(5, hoursToMinutes(13,0), hoursToMinutes(17,0)));
        weekTT21[5].add(new ClassBlock(6, hoursToMinutes(8,0), hoursToMinutes(12,30)));
        weekTT21[5].add(new ClassBlock(6, hoursToMinutes(13,0), hoursToMinutes(20,30)));
        weekTT21[6].add(new ClassBlock(7, hoursToMinutes(10,0), hoursToMinutes(13,0)));
        weekTT21[6].add(new ClassBlock(7, hoursToMinutes(14,0), hoursToMinutes(18,30)));
        allClassrooms.add(new Classroom("2.1", weekTT21));

        ArrayList<ClassBlock>[] weekTT24 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT24[i] = new ArrayList<>();
        weekTT24[1].add(new ClassBlock(2, hoursToMinutes(8,0), hoursToMinutes(18,30)));
        weekTT24[2].add(new ClassBlock(3, hoursToMinutes(8,0), hoursToMinutes(15,0)));
        weekTT24[2].add(new ClassBlock(3, hoursToMinutes(16,0), hoursToMinutes(19,0)));
        weekTT24[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(10,0)));
        weekTT24[3].add(new ClassBlock(4, hoursToMinutes(11,0), hoursToMinutes(14,0)));
        weekTT24[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(9,0)));
        weekTT24[4].add(new ClassBlock(5, hoursToMinutes(9,30), hoursToMinutes(13,0)));
        weekTT24[4].add(new ClassBlock(5, hoursToMinutes(14,0), hoursToMinutes(20,0)));
        weekTT24[5].add(new ClassBlock(6, hoursToMinutes(9,0), hoursToMinutes(12,0)));
        weekTT24[5].add(new ClassBlock(6, hoursToMinutes(13,0), hoursToMinutes(15,0)));
        weekTT24[5].add(new ClassBlock(6, hoursToMinutes(16,0), hoursToMinutes(18,0)));
        allClassrooms.add(new Classroom("2.4", weekTT24));

        ArrayList<ClassBlock>[] weekTT25 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT25[i] = new ArrayList<>();
        weekTT25[1].add(new ClassBlock(2, hoursToMinutes(8,0), hoursToMinutes(15,0)));
        weekTT25[1].add(new ClassBlock(2, hoursToMinutes(15,30), hoursToMinutes(17,0)));
        weekTT25[2].add(new ClassBlock(3, hoursToMinutes(8,0), hoursToMinutes(9,0)));
        weekTT25[2].add(new ClassBlock(3, hoursToMinutes(9,30), hoursToMinutes(12,30)));
        weekTT25[2].add(new ClassBlock(3, hoursToMinutes(13,0), hoursToMinutes(17,30)));
        weekTT25[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(12,30)));
        weekTT25[3].add(new ClassBlock(4, hoursToMinutes(13,0), hoursToMinutes(14,0)));
        weekTT25[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(17,0)));
        weekTT25[4].add(new ClassBlock(5, hoursToMinutes(18,0), hoursToMinutes(20,0)));
        weekTT25[5].add(new ClassBlock(6, hoursToMinutes(8,30), hoursToMinutes(10,0)));
        weekTT25[5].add(new ClassBlock(6, hoursToMinutes(10,30), hoursToMinutes(12,0)));
        weekTT25[5].add(new ClassBlock(6, hoursToMinutes(13,0), hoursToMinutes(17,0)));
        weekTT25[5].add(new ClassBlock(6, hoursToMinutes(17,30), hoursToMinutes(19,30)));
        allClassrooms.add(new Classroom("2.5", weekTT25));

        ArrayList<ClassBlock>[] weekTT31 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT31[i] = new ArrayList<>();
        weekTT31[1].add(new ClassBlock(2, hoursToMinutes(8,0), hoursToMinutes(17,0)));
        weekTT31[2].add(new ClassBlock(3, hoursToMinutes(8,0), hoursToMinutes(12,30)));
        weekTT31[2].add(new ClassBlock(3, hoursToMinutes(13,30), hoursToMinutes(17,30)));
        weekTT31[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(14,0)));
        weekTT31[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(11,0)));
        weekTT31[4].add(new ClassBlock(5, hoursToMinutes(14,0), hoursToMinutes(16,30)));
        weekTT31[4].add(new ClassBlock(5, hoursToMinutes(17,0), hoursToMinutes(20,0)));
        weekTT31[5].add(new ClassBlock(6, hoursToMinutes(8,0), hoursToMinutes(13,0)));
        weekTT31[5].add(new ClassBlock(6, hoursToMinutes(14,0), hoursToMinutes(18,0)));
        allClassrooms.add(new Classroom("3.1", weekTT31));

        ArrayList<ClassBlock>[] weekTT34 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT34[i] = new ArrayList<>();
        weekTT34[1].add(new ClassBlock(2, hoursToMinutes(9,0), hoursToMinutes(11,0)));
        weekTT34[1].add(new ClassBlock(2, hoursToMinutes(12,30), hoursToMinutes(18,0)));
        weekTT34[2].add(new ClassBlock(3, hoursToMinutes(8,0), hoursToMinutes(11,0)));
        weekTT34[2].add(new ClassBlock(3, hoursToMinutes(12,0), hoursToMinutes(13,0)));
        weekTT34[2].add(new ClassBlock(3, hoursToMinutes(14,0), hoursToMinutes(17,0)));
        weekTT34[3].add(new ClassBlock(4, hoursToMinutes(9,0), hoursToMinutes(11,0)));
        weekTT34[3].add(new ClassBlock(4, hoursToMinutes(11,30), hoursToMinutes(13,30)));
        weekTT34[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(9,0)));
        weekTT34[4].add(new ClassBlock(5, hoursToMinutes(10,30), hoursToMinutes(12,30)));
        weekTT34[4].add(new ClassBlock(5, hoursToMinutes(13,0), hoursToMinutes(17,0)));
        weekTT34[4].add(new ClassBlock(5, hoursToMinutes(17,30), hoursToMinutes(19,30)));
        weekTT34[5].add(new ClassBlock(6, hoursToMinutes(8,0), hoursToMinutes(13,0)));
        weekTT34[5].add(new ClassBlock(6, hoursToMinutes(14,0), hoursToMinutes(16,0)));
        allClassrooms.add(new Classroom("3.4", weekTT34));

        ArrayList<ClassBlock>[] weekTT35 = (ArrayList<ClassBlock>[])new ArrayList[7];
        for(int i = 0; i < 7; i++)
            weekTT35[i] = new ArrayList<>();
        weekTT35[1].add(new ClassBlock(2, hoursToMinutes(8,0), hoursToMinutes(12,30)));
        weekTT35[1].add(new ClassBlock(2, hoursToMinutes(13,0), hoursToMinutes(17,0)));
        weekTT35[2].add(new ClassBlock(3, hoursToMinutes(8,30), hoursToMinutes(9,30)));
        weekTT35[2].add(new ClassBlock(3, hoursToMinutes(10,0), hoursToMinutes(13,0)));
        weekTT35[2].add(new ClassBlock(3, hoursToMinutes(14,0), hoursToMinutes(18,0)));
        weekTT35[3].add(new ClassBlock(4, hoursToMinutes(8,0), hoursToMinutes(11,0)));
        weekTT35[3].add(new ClassBlock(4, hoursToMinutes(11,30), hoursToMinutes(13,0)));
        weekTT35[4].add(new ClassBlock(5, hoursToMinutes(8,0), hoursToMinutes(9,0)));
        weekTT35[4].add(new ClassBlock(5, hoursToMinutes(10,30), hoursToMinutes(12,0)));
        weekTT35[4].add(new ClassBlock(5, hoursToMinutes(13,30), hoursToMinutes(15,30)));
        weekTT35[5].add(new ClassBlock(6, hoursToMinutes(11,0), hoursToMinutes(14,0)));
        weekTT35[5].add(new ClassBlock(6, hoursToMinutes(15,30), hoursToMinutes(18,30)));
        allClassrooms.add(new Classroom("3.5", weekTT35));

        return allClassrooms;
    }


    private static int hoursToMinutes(int hours, int minutes) {
        return hours*60+minutes;
    }
}

