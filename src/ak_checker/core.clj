(ns ak-checker.core)

;; #### COMMON
(defn ok? [m]
  (or (= (:stat m) :ok) (= (:stat m) "ok")))

(defn err? [m]
  (or (= (:stat m) :err) (= (:stat m) "err")))
