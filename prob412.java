class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for(int i = 1; i<=n; i++){
            list.add(""+i);
        }
        for(int i = 2; i<n; i+=3){
            list.set(i, "Fizz");
        }
        for(int i = 4; i<n; i+=5){
            list.set(i, "Buzz");
        }
        for(int i = 14; i<n; i+=15){
            list.set(i, "FizzBuzz");
        }
        return list;
        
    }
}
