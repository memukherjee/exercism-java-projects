import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class PythagoreanTriplet {
    int oppositeSide, adjacentSide, hypotenuseSide;
    PythagoreanTriplet(int oppositeSide, int adjacentSide, int hypotenuseSide) {
        this.oppositeSide = oppositeSide;
        this.adjacentSide = adjacentSide;
        this.hypotenuseSide = hypotenuseSide;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) return true;
        if (comparedObject == null || getClass() != comparedObject.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) comparedObject;
        return this.oppositeSide == that.oppositeSide &&
                this.adjacentSide == that.adjacentSide &&
                this.hypotenuseSide == that.hypotenuseSide;
    }

    @Override
    public int hashCode() {
        return Objects.hash(oppositeSide, adjacentSide, hypotenuseSide);
    }
    
    static TripletListBuilder getTripletListBuilder() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        int sumOfTheSides, maxFactor;
        TripletListBuilder thatSumTo(int sumOfTheSides) {
            this.sumOfTheSides = sumOfTheSides;
            if(maxFactor==0)
                maxFactor = sumOfTheSides;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> buildTriplets() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for(int oppositeSide = 1; oppositeSide<= sumOfTheSides/3; oppositeSide++) {
                for(int adjacentSide = oppositeSide+1; adjacentSide<= sumOfTheSides/2; adjacentSide++){
                    int hypotenuseSide = sumOfTheSides - oppositeSide - adjacentSide;
                    if(hypotenuseSide > maxFactor)
                        continue;
                    if(oppositeSide*oppositeSide+adjacentSide*adjacentSide == hypotenuseSide*hypotenuseSide) {
                        triplets.add(new PythagoreanTriplet(oppositeSide, adjacentSide, hypotenuseSide));
                    }
                }
            }
            return triplets;
        }

    }

}