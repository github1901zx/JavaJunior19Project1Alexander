package homework.lesson.lession14;

import java.util.*;

public class CollectionUtilsHomeWork implements CollectionUtils {

    public CollectionUtilsHomeWork() {//default

    }

    @Override
    public java.util.Collection<Integer> union(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {

        ArrayList<Integer> set = new ArrayList<>();

        set.addAll(a);
        set.addAll(b);

        return new ArrayList<Integer>(set);
    }

    @Override
    public java.util.Collection<Integer> intersection(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (Integer t : a) {
            if (b.contains(t)) {
                list.add(t);
            }
        }
        for (Integer t : b) {
            if (a.contains(t)) {
                list.add(t);
            }
        }


        return list;

    }

    @Override
    public Set<Integer> unionWithoutDuplicate(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {

        HashSet<Integer> set = new HashSet<>();

        set.addAll(a);
        set.addAll(b);

        return set;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {

        HashSet<Integer> set = new HashSet<>();

        for (Integer t : a) {
            if (b.contains(t)) {
                set.add(t);
            }
        }

        return set;
    }

    @Override
    public java.util.Collection<Integer> difference(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (Integer t : a) {
            if (!b.contains(t)) {
                list.add(t);
            }
        }
        for (Integer t : b) {
            if (!a.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }

}
