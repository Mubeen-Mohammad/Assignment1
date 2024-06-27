// Task 1: Generics and Type Safety
// Create a generic Pair class that holds two objects of different types, and 
//write a method to return a reversed version of the pair.


public class typesafety<T, U> {
        private T first;
        private U second;
    
        public typesafety(T first, U second) {
            this.first = first;
            this.second = second;
        }
    
        public T getFirst() {
            return first;
        }
    
        public void setFirst(T first) {
            this.first = first;
        }
    
        public U getSecond() {
            return second;
        }
    
        public void setSecond(U second) {
            this.second = second;
        }
    
        public typesafety<U, T> reverse() {
            return new typesafety<>(second, first);
        }
    
        @Override
        public String toString() {
            return "Pair{" + "first=" + first + ", second=" + second + '}';
        }
    
        public static void main(String[] args) {

            typesafety<String, Integer> originalPair = new typesafety<>("Hello", 5);
            System.out.println("Original Pair: " + originalPair);
    
            typesafety<Integer, String> reversedPair = originalPair.reverse();
            System.out.println("Reversed Pair: " + reversedPair);
        }
}

