Технический долг в рамках лекций:
1)  Реализована Абстрактная Фабрика.
2)  Реализован Singleton. Есть DBConnection, он реализован как потокобезопасный пул. Для каждого потока есть свой DBConnection, доступ к instance по ThreadID в явном (или косвенном) виде, доступ потока безопасный.
3)  Реализован Decorator для чтения \ записи в файл.
