package com.company;



public class linkedList<E> {

    private linkedList<E> lastelem;
    private linkedList<E> firstelem;
    private int size = 0;

    public linkedList(){
        lastelem=new List<E>(null,firstelem,null);
        firstelem=new List<E>(null,null,lastelem);
    }


    public class List<E> {
        private E currentElement;
        private List<E> nextElement;
        private List<E> prevElement;

        public List(E currentElement, List<E> nextElement, List<E> prevElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

    }



    void addback(E currentElement){

        List a = new List();  //создаём новый элемент
        a.currentElement = E;
        if (lastelem == null)           //если список пуст
        {                           //то указываем ссылки начала и конца на новый элемент
            firstelem = a;               //т.е. список теперь состоит из одного элемента
            lastelem = a;
        } else {
            firstelem.next = a;          //иначе "старый" последний элемент теперь ссылается на новый
            lastelem = a;               //а в указатель на последний элемент записываем адрес нового элемента
        }

    }





}