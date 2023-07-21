package org.example;

public enum StudyProfile {
    JURISPRUDENCE ("Юриспруденция"),
    MANAGEMENT ("Делопроизводство"),
    FINANCIAL ("Финансы"),
    ADMINISTRATION ("Администрирование"),
    MEDICINE ("Медицина"),
    SURGERY("Хирургия"),
    THERAPY ("Терапия"),
    PSYCHOLOGY ("Психология"),
    CARDIOLOGY("Кардиология"),
    PHLEBOLOGY("Флебология"),
    GASTROENTEROLOGY("Гастроэнтерология");

    private String profileName;

    StudyProfile (String profileName) {
        this.profileName = profileName;
    }
}
