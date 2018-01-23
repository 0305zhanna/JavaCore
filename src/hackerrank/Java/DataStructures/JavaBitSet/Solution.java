package hackerrank.Java.DataStructures.JavaBitSet;

import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<BitSet> bitSets = new ArrayList<>(Arrays.asList(null,new BitSet(n),new BitSet(n)));

        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            String op = in.next();
            int op1 = in.nextInt();
            int op2 = in.nextInt();
            switch (op){
                case "AND":
                    bitSets.get(op1).and(bitSets.get(op2));
                    print(bitSets);
                    break;
                case "OR":
                    bitSets.get(op1).or(bitSets.get(op2));
                    print(bitSets);
                    break;
                case "XOR":
                    bitSets.get(op1).xor(bitSets.get(op2));
                    print(bitSets);
                    break;
                case "FLIP":
                    bitSets.get(op1).flip(op2);
                    print(bitSets);
                    break;
                case "SET":
                    bitSets.get(op1).set(op2);
                    print(bitSets);
                    break;
                default:
                    throw new Exception("No such operator!");
            }
        }
    }

    private static void print(List<BitSet> bitSets) {
        System.out.println(String.format("%d %d", bitSets.get(1).cardinality(), bitSets.get(2).cardinality()));
    }
}
