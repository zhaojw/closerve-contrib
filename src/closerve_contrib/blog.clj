(ns closerve-contrib.blog
  (:use [korma db core]
        [closerve-contrib db]))

(defentity blogs)
(defentity users)

(defn get-blog-list []
  (select blogs 
          (join users (= :users.id :author_id))
          (where {:published true})
          (order :id :DESC))
  )
