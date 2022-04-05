package OpenClosed;

abstract class Sql {
    public Sql() {
    }

    abstract String generate();
}

class InsertSql extends Sql {

    @Override
    String generate() {
        return null;
    }
}

class SelectSql extends Sql{

    @Override
    String generate() {
        return null;
    }
}

class Delete extends Sql{

    @Override
    String generate() {
        return "Delete";
    }
}
