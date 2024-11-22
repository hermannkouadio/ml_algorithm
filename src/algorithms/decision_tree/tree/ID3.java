package algorithms.decision_tree.tree;

import algorithms.decision_tree.TreeAttribute;

public class ID3 extends DecisionTree {
    @Override
    void findTheOptimalDT() {

    }

    @Override
    void findSplitPoint() {

    }


    /**
     * Find attribute with the smallest amount of entropy
     */
    void findBestAttribute(){

    }

    /**
     * For a given attribute, compute the related information gain
     * @param attr represents a specific attribute or class label
     * @param sv is the entropy of dataset, S
     * @param |Sv|/ |S| represents the proportion of the values in Sv to the number of values in dataset, S
     * @param svEntropy is the entropy of dataset, Sv
     */
    void computeInformationGain(TreeAttribute attr, float sEntropy, float sv, float svEntropy){

    }
}
