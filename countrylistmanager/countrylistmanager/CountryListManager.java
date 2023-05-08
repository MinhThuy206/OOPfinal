package com.countrylistmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryListManager {
    // Singleton pattern
    private static CountryListManager instance;

    private List<AbstractCountry> countryList;

    private CountryListManager() {
        countryList = new LinkedList<>();
    }

    public static CountryListManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new CountryListManager();
        }
        return instance;
    }

    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    public void append(AbstractCountry country) {
        /* TODO */
        countryList.add(country);
    }

    public void add(AbstractCountry country, int index) {
        /* TODO */
        countryList.add(index, country);
    }

    public void remove(int index) {
        /* TODO */
        countryList.remove(index);
    }

    public void remove(AbstractCountry country) {
        /* TODO */
        countryList.remove(country);
    }

    public AbstractCountry countryAt(int index) {
        /* TODO */
        return countryList.get(index);
    }

    public List<AbstractCountry> sortPopulationIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getPopulation() - right.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortPopulationDecreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return right.getPopulation() - left.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortAreaIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                if (left.getArea() > right.getArea()) {
                    return 1;
                } else if (left.getArea() < right.getArea()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortAreaDecreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return (int) (left.getPopulation() - right.getPopulation());
            }
        });
        return newList;

    }

    public List<AbstractCountry> sortGdpIncreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return (int) (left.getGdp() - right.getGdp());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortGdpDecreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return (int) (right.getGdp() - left.getGdp());
            }
        });
        return newList;
    }

    public List<AbstractCountry> filterContinent(String continent) {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>();
        for (AbstractCountry country : countryList) {
            if (country.getClass().getName().equals(continent)) {
                newList.add(country);
            }
        }
        return newList;
    }

    public List<AbstractCountry> filterCountriesMostPopulous(int howMany) {
        /* TODO */
        List<AbstractCountry> newList = sortPopulationDecreasing();
        return newList.subList(0, howMany);
    }

    public List<AbstractCountry> filterCountriesLeastPopulous(int howMany) {
        /* TODO */
        List<AbstractCountry> newList = sortPopulationIncreasing();
        return newList.subList(0, howMany);
    }

    public List<AbstractCountry> filterCountriesLargestArea(int howMany) {
        /* TODO */
        List<AbstractCountry> newList = sortAreaDecreasing();
        return newList.subList(0, howMany);
    }

    public List<AbstractCountry> filterCountriesSmallestArea(int howMany) {
        /* TODO */
        List<AbstractCountry> newList = sortAreaIncreasing();
        return newList.subList(0, howMany);
    }

    public List<AbstractCountry> filterCountriesHighestGdp(int howMany) {
        /* TODO */
        List<AbstractCountry> newList = sortGdpDecreasing();
        return newList.subList(0, howMany);
    }

    public List<AbstractCountry> filterCountriesLowestGdp(int howMany) {
        /* TODO */
        List<AbstractCountry> newList = sortGdpIncreasing();
        return newList.subList(0, howMany);
    }

    public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (AbstractCountry country : countryList) {
            codeOfCountries.append(country.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(List<AbstractCountry> countryList) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (AbstractCountry country : countryList) {
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
