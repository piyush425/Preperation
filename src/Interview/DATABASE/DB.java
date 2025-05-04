package Interview.DATABASE;

public class DB {
}

/**
 * In DBMS, data is stored in data pages, which are grouped into blocks. A block contains multiple data pages,
 * and data is typically stored in rows.
 *
 * When we create an index on a column, the DBMS uses a B+ Tree to sort and organize the index,
 * making search queries faster (O(log n)).
 *
 * A clustered index determines the physical order of the data in the table (only one per table).
 * A non-clustered index stores pointers to the actual data without changing its physical order (multiple allowed).
 */


/**
 * Physical order (Clustered Index) → Data is stored in the same order as the index.
 * Logical order (Non-Clustered Index) → Data is stored separately, but an index maintains sorted pointers.
 *
 *
 * X
 *
 * Feature	| Clustered Index (Physical Order)|	Non-Clustered Index (Logical Order)
 * Order Type|	Physical order of data is changed	|Only the index is sorted, not the actual data
 * Number per Table|	Only one per table	|Can have multiple non-clustered indexes
 * Storage|	Data pages are stored in index order	|Creates a separate index with pointers
 * Search Performance|	Faster (data is in order)	|Slightly slower (extra lookup needed)
 * Example|	PRIMARY KEY column	|CREATE INDEX on other columns
 */