import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class PythagoreanTriplet {
    int a,b,c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "PythagoreanTriplet{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        int sum, maxFactor;
        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            if(maxFactor==0)
                maxFactor = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for(int i=1; i<=sum/3; i++) {
                for(int j=i+1; j<=sum/2; j++){
                    int k = sum-i-j;
                    if(k>maxFactor)
                        continue;
                    if(i*i+j*j == k*k) {
                        triplets.add(new PythagoreanTriplet(i, j, k));
                    }
                }
            }
            return triplets;
        }

    }

}