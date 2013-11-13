(ns closerve-contrib.db
  (:use [korma db core]))

(defn init-db [driver dbspec]
  "[driver dbspec]"
  "should call this init-db function before using other modules"
  (let [dbd (condp = driver
              "postgres" postgres
              "mysql" mysql)
        
        ] 
    (defdb db (dbd dbspec))))

