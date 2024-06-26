package io.ebean.config.dbplatform;

import io.ebean.Query;

/**
 * The request object for the query that can have sql limiting applied to it
 * (such as a LIMIT OFFSET clause).
 */
public interface SqlLimitRequest {

  /**
   * Return ANSI SQL Offset and next rows.
   */
  String ansiOffsetRows();

  /**
   * Create and return buffer including the select distinct clause.
   */
  StringBuilder selectDistinct();

  /**
   * Create and return buffer including the select distinct on clause.
   */
  StringBuilder selectDistinctOnSql();

  /**
   * Return true if the query uses distinct.
   */
  boolean isDistinct();

  /**
   * Return the first row value.
   */
  int getFirstRow();

  /**
   * Return the max rows for this query.
   */
  int getMaxRows();

  /**
   * Return the sql query.
   */
  String getDbSql();

  /**
   * Return the orderBy clause of the sql query.
   */
  String getDbOrderBy();

  /**
   * return the query
   */
  Query<?> getOrmQuery();

  /**
   * return the database platform
   */
  DatabasePlatform getDbPlatform();
}
