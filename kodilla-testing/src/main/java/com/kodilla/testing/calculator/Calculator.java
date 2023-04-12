package com.kodilla.testing.calculator;

public class Calculator {

        private int firstNumber;
        private int seccondNumber;

   public Calculator( int firstNumber, int seccondNumber ){
            this.firstNumber = firstNumber;
            this.seccondNumber = seccondNumber;
        }

        public int getAdd () {
            return firstNumber + seccondNumber;
        }
        public int getSub () {
            return firstNumber - seccondNumber;
        }
    }






