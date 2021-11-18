1.Podstawowe informacje.

    Aby storzone API działało neleży uruchomić również API z poprzedniego zadania jako oddzielnie działający serwer!

    Po uruchomieniu aplikacji i wpisaniu w przeglądarce localhost:6060 wyświetli się poniższa instrukcja:
    Aby skorzystać z zaimplementowanej funkcjonalności jako endpoint należy do URL dopisać:
        "/JSON?str=" oraz dowolny string aby uzusykać plik typu JSON;
        "/CSV?str=" oraz dowolny string aby uzusykać plik typu CSV;
        "/XML?str=" oraz dowolny string aby uzusykać plik typu XML;
        "/TXT?str=" oraz dowolny string aby uzusykać plik typu TXT.

    API zwróci informacje o podanym stringu w wybranej postać z 3 dostępnych powyżej.
    W przypadku pliku XML, aby uzyskać widok struktury pliku należy wyświetlić kod źródłowy strony.

2. Przykładowe dane.

    Po wpisaniu "localhost:6060/JSON?str=Rower3.2.1#" wyświetli się nam informacja: "{"Wielkie litery": 1, "Małe litery": 4, "Cyfry": 3, "Znaki specjalne": 2, "Suma znaków": 10 }".
    Po wpisaniu "localhost:6060/CSV?str=Rower3.2.1#" wyświetli się nam informacja: "Wielkie litery,Małe litery,Cyfry,Znaki specjalne,Suma znaków 1,4,3,2,10" (niestety html ignoruje znak '\n' używany w pikach jako znak nowej linii).
    Po wpisaniu "localhost:6060/TXT?str=Rower3.2.1#" wyświetli się nam informacja: "Wielkie litery: 1 Male litery: 4 Cyfry: 3 Znaki specjalne: 2 Suma znaków: 10".
    Po wpisaniu "localhost:6060/XML?str=Rower3.2.1#" wyświetli się nam informacja: "1 4 3 2 10" (aby zobaczeć strukturę pliku należy wyświetlić kod źródłowy strony)
        wtedy kod źródłowy wygląda następująco: <stringinfo>
                                                <wielkielitery>1</wielkielitery>
                                                <malelitery>4</malelitery>
                                                <cyfry>3</cyfry>
                                                <znakispecjalne>2</znakispecjalne>
                                                <sumaznaków>10</sumaznaków>
                                                </stringinfo>

