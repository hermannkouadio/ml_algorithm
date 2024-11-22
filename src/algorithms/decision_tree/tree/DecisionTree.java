package algorithms.decision_tree.tree;

import algorithms.AlgorithmI;

import java.util.Map;

public abstract class DecisionTree implements AlgorithmI<Map<String, String>, String> {

    @Override
    public void initialization() {

    }

    @Override
    public void definition() {

    }

    @Override
    public String process(Map<String, String> stringStringMap) {
        return null;
    }

    abstract void findTheOptimalDT();

    abstract void findSplitPoint();
}
